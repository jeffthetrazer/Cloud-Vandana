function submitForm(event) {
    event.preventDefault(); 
    const form = document.getElementById('surveyForm');
    const formData = new FormData(form);

    const submittedValues = [];
    formData.forEach((value, key) => {
        submittedValues.push(`${key}: ${value}`);
    });

    const popup = document.getElementById('popup');
    const submittedValuesList = document.getElementById('submittedValues');
    submittedValuesList.innerHTML = '';

    submittedValues.forEach((value) => {
        const listItem = document.createElement('li');
        listItem.textContent = value;
        submittedValuesList.appendChild(listItem);
    });

    popup.style.display = 'block';
}

function closePopup() {
    const popup = document.getElementById('popup');
    popup.style.display = 'none';
}

function resetForm() {
    const form = document.getElementById('surveyForm');
    form.reset();
}
