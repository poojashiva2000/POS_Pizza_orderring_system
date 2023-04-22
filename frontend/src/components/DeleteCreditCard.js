// import { setSelectionRange } from '@testing-library/user-event/dist/utils';
import axios from "axios";
import React, { useState } from "react";
// import Header from '../Header';
// import Footer from '../Footer';
// import './Delete.css'

function DeleteCreditCard() {
  const [creditCardNumber, setCreditCardNumber] = useState();
  const handleSubmit = (e) => {
    e.preventDefault();
    axios
      .delete(`http://localhost:8080/user/deleteCreditCard/` + creditCardNumber)
      .then((res) => alert("Data is Deleted"));
    console.log("Store Deleted successfully..." + creditCardNumber);
  };
  return (
    <div>
      <div className="d">
        {/* <Header/> */}
        <div className="a">
          <h1 style={{ display: "flex", justifyContent: "center" }}>
            {" "}
            DELETE CREDITCARD
          </h1>
          <form
            onSubmit={handleSubmit}
            style={{
              display: "flex",
              flexDirection: "column",
              alignItems: "center",
              marginTop: "20px",
            }}
          >
            Enter creditCardNumber :{" "}
            <input
              type="text"
              value={creditCardNumber}
              onChange={(e) => {
                setCreditCardNumber(e.target.value);
              }}
            />
            <br />
            <button>Delete creditcard</button>
          </form>
        </div>
      </div>
      {/* <Footer/> */}
    </div>
  );
}

export default DeleteCreditCard;
