import React from "react";
import { useNavigate } from "react-router-dom";

function Header() {
  const nav = useNavigate();

  const metho = () => {
    nav("/login");
  };
  return (
    <div>
      <h1 style={{ display: "flex", justifyContent: "center" }}>
        PIZZA ORDERING SYSTEM
      </h1>
      <br />
      <br /> <br />
      <br />
      <br />
      <br />
      <br />
      <br />
      <br />
      <br />
      <br />
      <div style={{ display: "flex", justifyContent: "center" }}>
        <button onClick={metho} type="submit" style={{padding:"10px", width:"90px"}}>
          Login
        </button>
      </div>
    </div>
  );
}

export default Header;
