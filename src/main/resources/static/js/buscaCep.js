const inputCep = document.querySelector('#cep');

inputCep.addEventListener('blur', () => {
    let cep = inputCep.value;
    fetch(`https://viacep.com.br/ws/${cep}/json/`)
        .then(response => {
            response.json()
                .then(data => showData(data))
        })
        .catch(function (error) {
            console.log(error)
        })
});

const showData = (result) => {
    for(const campo in result) {
        if(document.querySelector(`#${campo}`)){
            document.querySelector(`#${campo}`).value = result[campo]
        }
    }
}

