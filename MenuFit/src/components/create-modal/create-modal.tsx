import { useEffect, useState } from "react";
import { useFoodDataMutate } from "../../hooks/useFoodDataMutate";
import { FoodData } from "../../interface/FoodData";
import "./modal.css";

interface InputProps {
  label: string;
  value: string | number;
  updateValue(value: any): void;
}

interface ModalProps {
  closeModal(): void;
}

const Input = ({ label, value, updateValue }: InputProps) => {
  return (
    <>
      <label>{label}</label>
      <input
        value={value}
        onChange={event => updateValue(event.target.value)}
      ></input>
    </>
  );
};

export function CreateModal({closeModal}: ModalProps) {
  const [tittle, setTittle] = useState("");
  const [image, setImage] = useState("");
  const [descricao, setDescricao] = useState("");
  const [calorias, setCalorias] = useState(0);

  const { mutate, isSuccess } = useFoodDataMutate();

  const submit = () => {
    const foodData: FoodData = {
      tittle,
      descricao,
      image,
      calorias,
    };
    mutate(foodData);
  };

  useEffect(() => {
    if(!isSuccess) return
      closeModal()
  },[isSuccess])

  return (
    <div className="modal-overlay">
      <div className="modal-body">
        <h2>Nova Comida</h2>
        <form className="input-container">
          <Input label="Nome" value={tittle} updateValue={setTittle}></Input>
          <Input label="Imagem" value={image} updateValue={setImage}></Input>
          <Input label="Descrição" value={descricao} updateValue={setDescricao}></Input>
          <Input label="Calorias" value={calorias} updateValue={setCalorias}></Input>
        </form>
        <button onClick={submit} className="btn-secondary"> Adicionar</button>
        <button onClick={closeModal} className="btn-close"> X </button>
      </div>
    </div>
  );
}
