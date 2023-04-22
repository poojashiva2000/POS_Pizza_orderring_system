// import { setSelectionRange } from '@testing-library/user-event/dist/utils';
import axios from "axios";
import React, { useState } from "react";
// import Header from '../Header';
// import Footer from '../Footer';
// import './Delete.css'

function DeleteProfile() {
  const [pvID, setPvID] = useState();
  const handleSubmit = (e) => {
    e.preventDefault();
    axios
      .delete(`http://localhost:8080/user/deleteProfile/` + pvID)
      .then((res) => alert("Data is Deleted"));
    console.log("Store Deleted successfully..." + pvID);
  };
  return (
    <div>
      <div className="d">
        {/* <Header/> */}
        <div className="a">
          <h1 style={{ display: "flex", justifyContent: "center" }}>
            {" "}
            DELETE PROFILE
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
            Enter pvID :{" "}
            <input
              type="text"
              value={pvID}
              onChange={(e) => {
                setPvID(e.target.value);
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

export default DeleteProfile;
