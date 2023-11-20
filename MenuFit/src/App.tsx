import { useState } from "react";
import "./App.css";
import { Card } from "./components/card/card";
import { useFoodData } from "./hooks/useFoodData";
import { CreateModal } from "./components/create-modal/create-modal";
import RegistrationModal from "./components/create-modal/RegistrationModal";
import RegistrationForm from "./components/create-modal/RegistrationModal";



function App() {
  const { data } = useFoodData();
  const [isModalOpen, setIsModalOpen]= useState(false);
  const handleOpenModal = () => {
    setIsModalOpen(prev => !prev)
  }
  const [isRegistrationFormOpen, setIsRegistrationFormOpen] = useState(true);

  return (
    <div className="container">
      <h1>Cardápio Fit</h1>
      <div className="card-grid">
        {data?.map((foodData) => (
          <Card
            tittle={foodData.tittle}
            image={foodData.image}
            descricao={foodData.descricao}
            calorias={foodData.calorias}
          />
        ))}
      </div>
      <div>
      <h1>My React Query App</h1>
      {/* Render o componente de registro com base no estado */}
      <RegistrationForm isOpen={isRegistrationFormOpen} />
    </div>
      {isModalOpen && <CreateModal  closeModal={handleOpenModal}/>}
      <button onClick={handleOpenModal}> Adicionar Nova Comida</button>
    </div>
  );
}

export default App;
