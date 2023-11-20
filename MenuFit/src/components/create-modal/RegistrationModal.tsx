// src/components/RegistrationForm.tsx
import React, { useState } from "react";
import axios from "axios";

interface RegistrationFormProps {
  isOpen: boolean;
}

const RegistrationForm: React.FC<RegistrationFormProps> = ({ isOpen }) => {
  const [nome, setnome] = useState("");
  const [email, setEmail] = useState("");
  const [senha, setSenha] = useState("");

  const API_URL = "http://localhost:8080";

  const handleRegister = async () => {
    try {
        console.log('Data to be sent:', { nome, email, senha });

      const response = await axios.post(API_URL + "/auth/register", {
        nome,
        email,
        senha,
      });

      // Handle successful registration
      console.log("Registration successful:", response.data);
    } catch (error) {
      // Handle registration error
      console.error("Registration error:");
    }
  };

  return (
    <div className="modal-overlay">
      <div className="modal-body">
        <h2>Registration Form</h2>
        <form className="input-container">
          <label>
            Nome:
            <input
              type="text"
              value={nome}
              onChange={(e) => setnome(e.target.value)}
            />
          </label>
          <br />
          <label>
            Email:
            <input
              type="email"
              value={email}
              onChange={(e) => setEmail(e.target.value)}
            />
          </label>
          <br />
          <label>
            Password:
            <input
              type="Senha"
              value={senha}
              onChange={(e) => setSenha(e.target.value)}
            />
          </label>
          <br />
          <button className="btn-secondary" type="button" onClick={handleRegister}>
            Register
          </button>
        </form>
      </div>
    </div>
  );
};

export default RegistrationForm;
