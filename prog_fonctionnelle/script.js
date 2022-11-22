// Définition d'un tableau
let values = [12, 27, -5, 40, -15, -17];
let count = 0;

// Définition des fonctions retournant les conditions à satisfaire
let estPositif = (a) => a > 0;
let estNegatif = (b) => b < 0;
let estNul = (c) => c = 0;
let entreDeuxBornes = (d, e, f) => d >= e && d <= f;

let conditionCountPlus = function(list) {
    list.forEach((elm) => {
        if(estPositif(elm)) {
            count++;
        }
    });
    console.log(count);
    return count;
};

let conditionCountMoins = function (list) {
  list.forEach((elm) => {
      if(estNegatif(elm)) {
          count++;
      }
  });
  console.log(count);
  return count;
};

let conditionCountNul = function (list) {
    list.forEach((elm) => {
        if(estNul(elm)) {
            count++;
        }
    });
    console.log(count);
    return count;
};

let conditionCountDeuxBornes = function (list, borneA, borneB) {
    list.forEach((elm) => {
        if(entreDeuxBornes(elm, borneA, borneB)) {
            count++;
        }
    });
    console.log(count);
    return count;
};
