const registrationForm = document.getElementById('registrationForm');

registrationForm.addEventListener('submit', (e) => {
    e.preventDefault();

    const username = document.getElementById('username').value;
    const email = document.getElementById('email').value;
    const password = document.getElementById('password').value;
    const confirmPassword = document.getElementById('confirmPassword').value;

    // Add validation checks for password strength and matching passwords
    if (password !== confirmPassword) {
        alert('Passwords do not match. Please try again.');
        return;
    }

    // Here, you can make an API call to your backend server to register the user
    // For now, we'll just log the user details to the console
    console.log('Username:', username);
    console.log('Email:', email);
    console.log('Password:', password);
});
