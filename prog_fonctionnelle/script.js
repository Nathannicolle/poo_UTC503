// Définition d'un tableau
let values = [12, 27, -5, 40, -15, -17];
let count = 0;

// Définition des fonctions retournant les conditions à satisfaire
let estPositif = (a) => a > 0;
let estNegatif = (b) => b < 0;
let estNul = (c) => c = 0;
let entreDeuxBornes = (d, e, f) => d >= e && d <= f;

let testConditon = function(list, condition) {
    list.forEach((elm) => {
        if(condition(elm)) {
            count++;
        }
    });
    // console.log(count);
    return count;
};


testConditon(values, (a)=>a>0);

let conditionalReturn = function (list, condFunction) {
    let listValues = [];
    list.forEach((elm) => {
       if(condFunction(elm)) {
           listValues.push(elm)
       }
    });
    return listValues;
};

// V1 de la version factorisé des deux fonctions du dessus
/* let conditionFunction = function(list, condFunc, init, operation) {
    let result = init;

    list.forEach((elm) => {
       if(condFunc(elm)) {
           operation(elm, result);
       }
    });
    return result;
};*/

let conditionFunction = function(list, condFunc, init, operation) {
    // On passe un objet pour avoir une cohérence entre l'initialisation en mode [] et en mode 0
    // Et donc pour fix le bug qui fait que le compteur restait à 0
    init.result = init.value;

    list.forEach((elm) => {
        if(condFunc(elm)) {
            operation(elm, init);
        }
    });
    return init.result;
};

// On a donc bien value sous forme d'objet
ajoutElmPositif = conditionFunction(values, (a)=>a>0, {value:[]}, (elm, r) => r.result.push(elm));
countElmPositif = conditionFunction(values, (a)=>a>0, {value:0}, (elm, r) => r.result++);

console.log(ajoutElmPositif);
console.log(countElmPositif);
// console.log(conditionalReturn(values, (a)=>a<0));
/*let calculNombreElements = (list, conditionFunction) => conditionFunction(list);

calculNombreElements(values, conditionCountPlus());*/