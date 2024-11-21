
function validateForm(event) {
    event.preventDefault();

    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;
    const errorMessage = document.getElementById('error-message');

    errorMessage.textContent = '';
    errorMessage.style.display = 'none';

    if (username === '' || password === '') {

        errorMessage.textContent = 'Palun täitke kõik väljad.';
        errorMessage.style.display = 'block';
        return false;
    }

    errorMessage.textContent = 'Kasutajanimi või parool on vale.';
    errorMessage.style.display = 'block';
}

return false;

