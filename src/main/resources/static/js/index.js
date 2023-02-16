
const inputRegistrationDate = document.querySelector('#registrationDate');
const inputRegistrant = document.querySelector('#registrant');
const inputUserCode = document.querySelector('#userCode');
let counter = 0;

document.addEventListener("DOMContentLoaded", function(event){
    inputRegistrationDate.value = formatDate();
    inputRegistrant.value = 'INM';
    inputUserCode.value = generateCode();

    console.log(formatDate())
});

document.addEventListener('click', function (event){
    counter++;
})

function formatDate() {
    let date = new Date(),
        month = '' + (date.getMonth() + 1),
        day = '' + date.getDate(),
        year = date.getFullYear();

    if (month.length < 2) month = '0' + month;
    if (day.length < 2) day = '0' + day;

    return [year, month, day].join('-');
}

function generateCode() {
    const data = new Date().toLocaleDateString();
    return data.substring(9) + data.substring(3, 5) + data.substring(0, 2) + counter;
}

