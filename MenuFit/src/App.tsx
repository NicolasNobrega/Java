import { useState } from "react";
import "./App.css";
import { Card } from "./components/card/card";
import { useFoodData } from "./hooks/useFoodData";
import { CreateModal } from "./components/create-modal/create-modal";

function App() {
  const { data } = useFoodData();
  const [isModalOpen, setIsModalOpen]= useState(false);
  const handleOpenModal = () => {
    setIsModalOpen(prev => !prev)
  }

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
      {isModalOpen && <CreateModal  closeModal={handleOpenModal}/>}
      <button onClick={handleOpenModal}> Adicionar Nova Comida</button>
    </div>
  );
}

export default App;
