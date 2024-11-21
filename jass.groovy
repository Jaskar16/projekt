// Funktsioon vormi valideerimiseks ja andmete kontrollimiseks
function validateForm(event) {
    event.preventDefault(); // Takistame vormi vaikimisi saatmist (see tähendab, et veebileht ei lae ega värskenda)

    // Saame kasutaja sisendi väärtused
    const username = document.getElementById('username').value; // Võtame kasutaja sisestatud kasutajanime väärtuse
    const password = document.getElementById('password').value; // Võtame kasutaja sisestatud parooli väärtuse
    const errorMessage = document.getElementById('error-message'); // Etsime HTML element, kus kuvatakse veateade

    // Eemaldame vana veateate, kui see oli olemas (kui eelnevalt oli vale sisend, siis eemaldame eelneva vea)
    errorMessage.textContent = ''; // Tühjendame veateate sisu
    errorMessage.style.display = 'none'; // Peidame veateate, kui see oli eelnevalt nähtav

    // Kontrollime, kas mõlemad väljad on täidetud
    if (username === '' || password === '') { 
        // Kui kasutajanimi või parool on tühi, siis kuvame veateate
        errorMessage.textContent = 'Palun täitke kõik väljad.'; // Kuvame vastava sõnumi
        errorMessage.style.display = 'block'; // Näitame veateate
        return false; // Takistame vormi saatmist, kuna mõni väli on täitmata
    }

    // Simuleerime edukat login'i
    // Siin on näide, kuidas kontrollida fikseeritud andmeid (näiteks: kasutajanimi: "admin", parool: "1234")
    if (username === 'admin' && password === '1234') { 
        // Kui kasutaja sisestatud kasutajanimi ja parool vastavad õigetele väärtustele
        alert('Login edukas!'); // Kuvame hüpikakna, mis ütleb, et login õnnestus
        window.location.href = 'success.html'; // Suuname kasutaja uuele lehele (success.html)
    } else {
        // Kui kasutajanimi või parool on vale, siis kuvame veateate
        errorMessage.textContent = 'Kasutajanimi või parool on vale.'; // Kuvame vastava veateate
        errorMessage.style.display = 'block'; // Näitame veateate
    }

    return false; // Takistame vormi vaikimisi saatmist (kuna vormi saatmine toimub ainult õnnestunud sisendi korral)
}