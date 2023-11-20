import "./card.css";

interface CardProps {
  calorias: number;
  tittle: string;
  descricao: string;
  image: string;
}

export function Card({ calorias, tittle, descricao, image }: CardProps) {
  return (
    <div className="card">
      <img src={image} alt="Imagem da Sua Comida"/>
      <h2>{tittle}</h2>
      <p className="descricao">{descricao}</p>
      <p>
        <b>Calorias: {calorias} </b>
      </p>
    </div>
  );
}
