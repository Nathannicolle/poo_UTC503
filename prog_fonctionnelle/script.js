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

/*let calculNombreElements = (list, conditionFunction) => conditionFunction(list);

calculNombreElements(values, conditionCountPlus());*/