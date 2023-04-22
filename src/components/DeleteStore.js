// import { setSelectionRange } from '@testing-library/user-event/dist/utils';
import axios from "axios";
import React, { useState } from "react";

// import "./Delete.css";

function DeleteStore() {
  const [storeID, setStoreID] = useState();
  const handleSubmit = (e) => {
    e.preventDefault();
    axios
      .delete(`http://localhost:8080/admin/deleteStore/` + storeID)
      .then((res) => alert("Data is Deleted"));
    console.log("Store Deleted successfully..." + storeID);
  };
  return (
    <div>
      <div className="d">
        {/* <Header/> */}
        <div className="a">
          <h1 style={{ display: "flex", justifyContent: "center" }}>
            {" "}
            DELETE STORE
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
            Enter Store ID :{" "}
            <input
              type="text"
              value={storeID}
              onChange={(e) => {
                setStoreID(e.target.value);
              }}
            />
            <br />
            <button>Delete Store</button>
          </form>
        </div>
      </div>
      {/* <Footer/> */}
    </div>
  );
}

export default DeleteStore;
