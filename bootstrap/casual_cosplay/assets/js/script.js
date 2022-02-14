let nome = document.querySelector('#name')
let email = document.querySelector('#email')
let mensagem = document.querySelector('#message')
let nomeOk = false
let emailOk = false
let mensagemOk = false

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

function validarMensagem() {
    let txtMsg = document.querySelector('#alertaMsg')

    if (mensagem.value.length > 300) {
        txtMsg.innerHTML = "O texto é muito grande. Digite no máximo 300 caracteres."
        txtMsg.style.color = 'red'
        txtMsg.style.display = 'block'
        mensagemOk = false
    } else {
        txtMsg.style.display = 'none'
        mensagemOk = true
    }

}

function enviar() {
    if (nomeOk == true && emailOk == true && mensagemOk == true){
        alert("Formulário enviado com sucesso!")
        return true
    }else {
        alert("Preencha o formulário corretamente antes de enviar.")
        return false
    }
}