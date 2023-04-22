import React, { useState, useEffect } from "react";
import axios from "axios";
import { label, Button, Container } from "react";
import { useNavigate } from "react-router-dom";

function Login() {
  const navigate= useNavigate();
  const [username, setUsername] = useState("");
  const [options, setOptions] = useState([]);
  const [password, setPassword] = useState("");
  const [option, setOption] = useState("select");
  const [redirect, nav] = useState("");
  const [error, setError] = useState("");

  function handleUserIdChange(event) {
    setUsername(event.target.value);
  }

  function handlePasswordChange(event) {
    setPassword(event.target.value);
  }

  function handleSubmit(event) {
    event.preventDefault();

    if (username === "AD-001" && password === "AD-001") {
      navigate("/CreateStore");
    } else if (username === "AD-002" && password === "AD-002") {
      navigate("/DeleteStore");
    } else if (username === "AD-003" && password === "AD-003") {
      navigate("/SelectStore");
    } else if (username === "AD-004" && password === "AD-004") {
      navigate("/UpdateStore");
    } else if (username === "AD-005" && password === "AD-005") {
      navigate("/CreateFood");
    } else if (username === "AD-006" && password === "AD-006") {
      navigate("/DeleteFood");
    } else if (username === "AD-007" && password === "AD-007") {
      navigate("/SelectFood");
    } else if (username === "AD-008" && password === "AD-008") {
      navigate("/UpdateFood");
    } else if (username === "AD-009" && password === "AD-009") {
      navigate("/UpdateOrder");
    } else if (username === "US-001" && password === "US-001") {
      navigate("/CreateOrder");
    } else if (username === "US-002" && password === "US-002") {
      navigate("/CreateCart");
    } else if (username === "US-003" && password === "US-003") {
      navigate("/SelectCart");
    } else if (username === "US-004" && password === "US-004") {
      navigate("/UpdateCart");
    }else if (username === "US-005" && password === "US-005") {
      navigate("/DeleteOrder");
     } else {
      setError("Invalid credentials");
    }
  }

  if (redirect) {
    return <redirect to={redirect} />;
  }

  // const paperStyle = { padding: "50px 20px", width: 600, margin: "20px auto" };
  return (
    <div >
      <div>
      {/* <Paper elevation={4} style={paperStyle} variant="outlined"> */}
      <div sx={{ m: 0, minWidth: 200 }} style={{ marginLeft: "45%" }}>
        <label style={{ fontSize: "25px" }}>Login</label>
      </div>
      <form
        onSubmit={handleSubmit}
        style={{
          display: "flex",
          flexDirection: "column",
          alignItems: "center",
          marginTop: "20px",
        }}
      >
        {error && <div style={{ color: "red" }}>{error}</div>}

        <div sx={{ m: 1, minWidth: 250 }}>
          <label style={{ fontSize: "15px" }}>User Type</label>
          <select style={{ height: "40px", fontSize: "15px" }}>
            <option value="select">Select</option>
            <option>Admin</option>
            <option>user</option>
          </select>
        </div>

        <div sx={{ m: 1, minWidth: 250 }}>
          <label style={{ fontSize: "17px" }}>Username</label>
          <input type="text" value={username} onChange={handleUserIdChange} />
        </div>

        <div sx={{ m: 1, minWidth: 250 }}>
          <label style={{ fontSize: "17px" }}>Password</label>
          <input
            type="password"
            value={password}
            onChange={handlePasswordChange}
          />
        </div>

        <div sx={{ m: 1, minWidth: 50 }}>
          <button variant="contained" color="primary" onClick={handleSubmit}>
            Login
          </button>
          
        </div>
      </form>
    </div>
    </div>
  );
}

export default Login;
