import React, { useState } from 'react'
import axios  from 'axios'
// import Header from '../Header'
// import Footer from '../Footer'
// import './update.css'
function UpdateProfile() {
    const[pvId1,setPvId1]=useState(0)
    const [firstName1,setFirstName]=useState('')
    const [lastName1,setLastName]=useState('')
    const[dateOfBirth1,setDateOfBirth]=useState('')
    const[gennder1,setGennder]=useState('')
    const [street1,setStreet]=useState('');
    const[location1,setLocation]=useState('');
    const[city1,setCity]=useState('')
    const [state1,setState]=useState('');
    const[pincode1,setPincode]=useState('');
    const[mobileNo1,setMobileNo]=useState('')
    const[emailID1,setEmailID]=useState('')
    const[password1,setPassword ]=useState('')
    const[obj,setObj]=useState({});
    const handeSubmit=(e)=>{
     e.preventDefault();
  
     setObj({pvId:pvId1,firstName:firstName1,lastName:lastName1,dateOfBirth:dateOfBirth1,gennder:gennder1,street:street1,location:location1,city:city1,state:state1,pincode:pincode1,mobileNo:mobileNo1,emailID:emailID1,password:password1})
  //      const ele=JSON.stringify(obj);
    //   console.log(ele) 
       console.log(JSON.stringify(obj)) 
     //  console.log(name+' '+electionDate+' '+district+' '+constituency+' '+countingDate);
    
     axios.put('http://localhost:8080/user/updateProfile',obj).then(
        (res)=>{
            console.log(res.data)
        }
     ).catch((err)=>{
        console.log(err)
     })
        }
  return (
    <div>
      <div className="x">
        {/* <Header/> */}
        <div className="y">
          <h1 style={{ display: "flex", justifyContent: "center" }}>
            UPDATE PROFILE
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
            Enter pvId :{" "}
            <input
              type="text"
              value={pvId1}
              onChange={(e) => {
                setPvId1(e.target.value);
              }}
            />
            <br />
            Enter FirstName :{" "}
            <input
              type="text"
              value={firstName1}
              onChange={(e) => {
                setFirstName(e.target.value);
              }}
            />
            <br />
            Enter LastName :{" "}
            <input
              type="text"
              value={lastName1}
              onChange={(e) => {
                setLastName(e.target.value);
              }}
            />
            <br />
            Enter DateOfBirth :{" "}
            <input
              type="text"
              value={dateOfBirth1}
              onChange={(e) => {
                setDateOfBirth(e.target.value);
              }}
            />
            <br />
            Enter Gender :{" "}
            <input
              type="text"
              value={gennder1}
              onChange={(e) => {
                setGennder(e.target.value);
              }}
            />
            <br />
            Enter Street :{" "}
            <input
              type="text"
              value={street1}
              onChange={(e) => {
                setStreet(e.target.value);
              }}
            />
            <br />
            Enter Location :{" "}
            <input
              type="text"
              value={location1}
              onChange={(e) => {
                setLocation(e.target.value);
              }}
            />
            <br />
            Enter City :{" "}
            <input
              type="text"
              value={city1}
              onChange={(e) => {
                setCity(e.target.value);
              }}
            />
            <br />
            Enter State :{" "}
            <input
              type="text"
              value={state1}
              onChange={(e) => {
                setState(e.target.value);
              }}
            />
            <br />
            Enter Pincode :{" "}
            <input
              type="text"
              value={pincode1}
              onChange={(e) => {
                setPincode(e.target.value);
              }}
            />
            <br />
            Enter MobileNo :{" "}
            <input
              type="text"
              value={mobileNo1}
              onChange={(e) => {
                setMobileNo(e.target.value);
              }}
            />
            <br />
            Enter emailID :{" "}
            <input
              type="text"
              value={emailID1}
              onChange={(e) => {
                setEmailID(e.target.value);
              }}
            />
            <br />
            Enter Password :{" "}
            <input
              type="text"
              value={password1}
              onChange={(e) => {
                setPassword(e.target.value);
              }}
            />
            <br />
            <button> UpdateProfile</button>
          </form>
        </div>
      </div>
      {/* <Footer/> */}
    </div>
  );
}

export default UpdateProfile;
