let nome = window.document.getElementById('nome')
let email = window.document.getElementById('email')
let assunto = window.document.getElementById('assunto')
let nomeOk = false
let emailOk = false
let assuntoOk = false

function validarNome() {
    let txtNome = document.querySelector('#alertaNome')
    if (nome.value.length < 2) {
        txtNome.innerHTML = "Nome inválido"
        txtNome.style.color = 'red'
        nomeOk = false
    } else {
        txtNome.innerHTML = "Nome válido"
        txtNome.style.color = 'green'
        nomeOk = true
    }
}

function validarEmail(field) {
    let txtEmail = document.querySelector('#alertaEmail')
    let usuario = field.value.substring(0, field.value.indexOf("@"));
    let dominio = field.value.substring(field.value.indexOf("@") + 1, field.value.length);

    if ((usuario.length >= 1) &&
        (dominio.length >= 3) &&
        (usuario.search("@") == -1) &&
        (dominio.search("@") == -1) &&
        (usuario.search(" ") == -1) &&
        (dominio.search(" ") == -1) &&
        (dominio.search(".") != -1) &&
        (dominio.indexOf(".") >= 1) &&
        (dominio.lastIndexOf(".") < dominio.length - 1)) {
            txtEmail.innerHTML="E-mail válido"
            txtEmail.style.color = 'green'
            emailOk = true
    }
    else {
        txtEmail.innerHTML="E-mail invalido"
        txtEmail.style.color = 'red'
        emailOk = false
    }
}

function validarAssunto() {
    let txtAssunto = document.querySelector('#alertaAssunto')

    if (assunto.value.length > 300) {
        txtAssunto.innerHTML = "O texto é muito grande. Digite no máximo 300 caracteres."
        txtAssunto.style.color = 'red'
        txtAssunto.style.display = 'block'
        assuntoOk = false
    } else {
        txtAssunto.style.display = 'none'
        assuntoOk = true
    }

}

function enviar() {
    if (nomeOk == true && emailOk == true && assuntoOk == true){
        alert("Formulário enviado com sucesso!")
        return true
    }else {
        alert("Preencha o formulário corretamente antes de enviar.")
        return false
    }
}