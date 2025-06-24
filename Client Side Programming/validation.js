function validateForm(event) {
  const email = document.getElementById("email").value.trim();
  const phone = document.getElementById("phone").value.trim();
  const services = document.querySelectorAll(
    'input[name="services[]"]:checked'
  );

  // Email
  const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
  if (!email || !emailPattern.test(email)) {
    alert("Please enter a valid email address.");
    event.preventDefault();
    return false;
  }

  // Phone number
  const phonePattern = /^\d{10}$/;
  if (!phonePattern.test(phone)) {
    alert("Enter a valid phone number.");
    event.preventDefault();
    return false;
  }

  // Services
  if (services.length === 0) {
    alert("Please select at least one service.");
    event.preventDefault();
    return false;
  }

  return true;
}

window.addEventListener("DOMContentLoaded", () => {
  const form = document.querySelector("form");
  form.addEventListener("submit", validateForm);
});
