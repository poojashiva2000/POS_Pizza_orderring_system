import React, { useState } from "react";
import axios from "axios";
// import Header from '../Header'
// import Footer from '../Footer'
// import './update.css'
function UpdateCreditCard() {
  const [creditCardNumber1, setCreditCardNumber] = useState();
  const [validFrom1, setValidFrom] = useState("");
  const [validTo1, setValidTo] = useState("");
  const [balance1, setBalance] = useState("");
  const [userId1, setUserID] = useState("");
  const [obj, setObj] = useState({});
  const handeSubmit = (e) => {
    e.preventDefault();

    setObj({
      creditCardNumber: creditCardNumber1,
      validFrom: validFrom1,
      validTo: validTo1,
      balance: balance1,
      userId: userId1,
    });
    const ele = JSON.stringify(obj);
    console.log(ele);
    console.log(obj);
    //  console.log(name+' '+electionDate+' '+district+' '+constituency+' '+countingDate);

    axios
      .put("http://localhost:8080/user/updateCreditCard", obj)
      .then((res) => {
        console.log(res.data);
      })
      .catch((err) => {
        console.log(err);
      });
  };
  return (
    <div>
      <div className="x">
        {/* <Header/> */}
        <div className="y">
          <h1 style={{ display: "flex", justifyContent: "center" }}>
            UPDATE STORE
          </h1>
          <form
            onSubmit={handeSubmit}
            style={{
              display: "flex",
              flexDirection: "column",
              alignItems: "center",
              marginTop: "20px",
            }}
          >
            Enter CreditCardNumber :{" "}
            <input
              type="text"
              value={creditCardNumber1}
              onChange={(e) => {
                setCreditCardNumber(e.target.value);
              }}
            />
            <br />
            Enter ValidFrom :{" "}
            <input
              type="text"
              value={validFrom1}
              onChange={(e) => {
                setValidFrom(e.target.value);
              }}
            />
            <br />
            Enter ValidTo :{" "}
            <input
              type="text"
              value={validTo1}
              onChange={(e) => {
                setValidTo(e.target.value);
              }}
            />
            <br />
            Enter Balance :{" "}
            <input
              type="text"
              value={balance1}
              onChange={(e) => {
                setBalance(e.target.value);
              }}
            />
            <br />
            Enter UserID:{" "}
            <input
              type="text"
              value={userId1}
              onChange={(e) => {
                setUserID(e.target.value);
              }}
            />
            <br />
            <button>Update CreditCard</button>
          </form>
        </div>
      </div>
      {/* <Footer/> */}
    </div>
  );
}

export default UpdateCreditCard;
