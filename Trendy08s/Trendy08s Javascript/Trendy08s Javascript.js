new Vue({
    el: "#app",
    data() {
      return {
        firstName: "",
        lastName: "",
        username: "",
        email: "",
        password: ""
      };
    },
    methods: {
      register() {
        if (!this.firstName) {
          alert("Please enter your first name.");
          return;
        }
  
        if (!this.lastName) {
          alert("Please enter your last name.");
          return;
        }
  
        if (!this.username) {
          alert("Please enter a username.");
          return;
        }

        if (!this.email) {
          alert("Please enter your email.");
          return;
        }
  
        const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
        if (!emailRegex.test(this.email)) {
          alert("Please enter a valid email address.");
          return;
        }

        if (!this.password) {
          alert("Please enter a password.");
          return;
        }
  
        if (this.password.length < 6) {
          alert("Password must be at least 6 characters long.");
          return;
        }
  
        console.log("First Name:", this.firstName);
        console.log("Last Name:", this.lastName);
        console.log("Username:", this.username);
        console.log("Email:", this.email);
        console.log("Password:", this.password);
        alert("Registration successful!");

        window.location.href = '../HTML/TICKETS.html';
      }
    }
  });