const inputRegistrationDate = document.querySelector('#registrationDate');
const inputRegistrant = document.querySelector('#registrant');
const inputUserCode = document.querySelector('#userCode');

const url = "http://localhost:8080/size";

document.addEventListener("DOMContentLoaded", function (event) {
    inputRegistrationDate.value = formatDate();
    inputRegistrant.value = 'INM';
    inputUserCode.value = generateCode();
});



// async function getIndexDatedToday() {
//     const response = await fetch(url);
//     const data = await response.json();
//     const obj = data
//     console.log(text)
//
//     return text;
// }

console.log(getIndexDatedToday());

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
    return data.substring(9) + data.substring(3, 5) + data.substring(0, 2) + '';
}
