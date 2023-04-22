// import { setSelectionRange } from '@testing-library/user-event/dist/utils';
import axios from "axios";
import React, { useState } from "react";

// import "./Delete.css";

function DeleteFood() {
  const [foodID, setFoodID] = useState();
  const handleSubmit = (e) => {
    e.preventDefault();
    axios
      .delete(`http://localhost:8080/admin/deleteFood/` + foodID)
      .then((res) => alert("Data is Deleted"));
    console.log("Store Deleted successfully..." + foodID);
  };
  return (
    <div>
      <div className="d">
        {/* <Header/> */}
        <div className="a">
          <h1 style={{ display: "flex", justifyContent: "center" }}>
            {" "}
            DELETE FOOD
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
            Enter Food ID :{" "}
            <input
              type="text"
              value={foodID}
              onChange={(e) => {
                setFoodID(e.target.value);
              }}
            />
            <br />
            <button>Delete Food</button>
          </form>
        </div>
      </div>
      {/* <Footer/> */}
    </div>
  );
}

export default DeleteFood;
