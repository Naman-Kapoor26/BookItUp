function Open() {
    document.getElementById("nav-links").style.display='flex';
    document.getElementById("bars").style.display='none';
    document.getElementById("close").style.display='block';
}
function Close() {
    document.getElementById("nav-links").style.display='none';
    document.getElementById("close").style.display='none';
    document.getElementById("bars").style.display='block';
}

var show;
function PreloadMain() {
    show = setTimeout(PreloadOne, 3000);
}
function PreloadOne() {
    document.getElementById("preloader").style.display='none';
    document.getElementById("container").style.display='block';
}


function showPassword() {
    var pass = document.getElementById("password");
    var e = document.getElementById("eye");
    var es = document.getElementById("eye-slash");
    if(pass.type == 'password') {
        pass.type = 'text';
        e.style.display = 'none';
        es.style.display = 'block';
    }
    else {
        pass.type = 'password';
        e.style.display = 'block';
        es.style.display = 'none';
    }
    
}
// Support Open function
function SupportOpen() {
    document.getElementById("support-form").style.display = 'flex';
    document.getElementById("s-open").style.display = 'none';
    document.getElementById("s-close").style.display = 'block';
}
// Support Close function
function SupportClose() {
    document.getElementById("support-form").style.display = 'none';
    document.getElementById("s-open").style.display = 'block';
    document.getElementById("s-close").style.display = 'none';
}

// Signin validation
function SigninValidate(event) {
    event.preventDefault();
    var email = document.signin.mail.value;
    var password = document.signin.password.value;
    if(email == 0) {
        alert("Email can't be blank");
        return false;
    }
    if(password == 0) {
        alert("Password can't be blank");
        return false;
    }
    if(email === "admin@gmail.com" && password === "admin") {
        window.location.replace("admin.html");
        return true;
    } 
    if(email === "manager@gmail.com" && password === "manager") {
        window.location.replace("manager.html");
        return true;
    } 
    if(email === "user@gmail.com" && password === "user") {
        window.location.replace("user.html");
        return true;
    } 
    else {
        alert("Wrong credentials")
        return false;
    }
    // location.replace("https://www.google.com")

}
// Signup validation
function SignupValidate() {
    var fname = document.signup.fname.value;
    var email = document.signup.mail.value;
    var empid = document.signup.empid.value;
    var password = document.signup.pass.value;
    var cpassword = document.signup.cpass.value;
    if(fname == 0) {
        alert("Name can't be blank");
        return false;
    }
    if(password != cpassword) {
        alert("Password and Confirm Password are not same");
        return false;
    }
    if(email == 0) {
        alert("Email can't be blank");
        return false;
    }
    if(password == 0) {
        alert("Password can't be blank");
        return false;
    }
    if(empid == 0) {
        alert("Employee ID can't be blank");
        return false;
    }
    if(cpassword == 0) {
        alert("Confirm Password can't be blank");
        return false;
    }
}

// contact form validation
function ContactValidate() {
    var firstName = document.contact.fname.value;
    var lastname = document.contact.lname.value;
    var eMail = document.contact.mail.value;
    var number = document.contact.phone.value;
    var query = document.contact.query.value;
    if(firstName == 0) {
        alert("First Name can't be blank");
        return false;
    }
    if(lastname == 0) {
        alert("Last Name can't be blank");
        return false;
    }
    if(eMail == 0) {
        alert("Email ID can't be blank");
        return false;
    }
    if(number == 0) {
        alert("Number Password can't be blank");
        return false;
    }
    if(query == 0) {
        alert("Query can't be blank");
        return false;
    }
}

// Support
function SupportValidate() {
    var fullName = document.support.fname.value;
    var empid = document.support.empid.value;
    var eMail = document.support.mail.value;
    var query = document.support.query.value;
    if(fullName == 0) {
        alert("Full Name can't be blank");
        return false;
    }
    if(empid == 0) {
        alert("Employee ID can't be blank");
        return false;
    }
    if(eMail == 0) {
        alert("Email ID can't be blank");
        return false;
    }
    if(query == 0) {
        alert("Query can't be blank");
        return false;
    }
}

// My Meeting page functions
// All meeting
var all = document.getElementById("all");
var upcoming = document.getElementById("upcoming");
var completed = document.getElementById("completed");
var cancelled = document.getElementById("cancelled");
var newbox = document.getElementById("newheadOne");
var upcomingbox = document.getElementById("upcomingheadOne");
var completedbox = document.getElementById("completedheadOne");
var cancelledbox = document.getElementById("cancelledheadOne");
function All() {    
    all.style.background = '#e84e36';
    upcoming.style.background = 'transparent';
    completed.style.background = 'transparent';
    cancelled.style.background = 'transparent';
    newbox.style.display = 'flex';
    upcomingbox.style.display = 'flex';
    completedbox.style.display = 'flex';
    cancelledbox.style.display = 'flex';
}

function Upcoming() {
    all.style.background = 'transparent';
    upcoming.style.background = '#e84e36';
    completed.style.background = 'transparent';
    cancelled.style.background = 'transparent';
    newbox.style.display = 'flex';
    upcomingbox.style.display = 'flex';
    completedbox.style.display = 'none';
    cancelledbox.style.display = 'none';
}

function Completed() {
    all.style.background = 'transparent';
    upcoming.style.background = 'transparent';
    completed.style.background = '#e84e36';
    cancelled.style.background = 'transparent';
    newbox.style.display = 'none';
    upcomingbox.style.display = 'none';
    completedbox.style.display = 'flex';
    cancelledbox.style.display = 'none';
}

function Cancelled() {
    all.style.background = 'transparent';
    upcoming.style.background = '#transparent';
    completed.style.background = 'transparent';
    cancelled.style.background = '#e84e36';
    newbox.style.display = 'none';
    upcomingbox.style.display = 'none';
    completedbox.style.display = 'none';
    cancelledbox.style.display = 'flex';
}

// Admin Page navigation change
var adminDashboard = document.getElementById("admin-dashboard");
var adminAccounts = document.getElementById("admin-accounts");
var adminHistory = document.getElementById("admin-history");
var adminManage = document.getElementById("admin-manage");
var adminHeading = document.getElementById("head-admin");
function AdminDashboard() {
    adminDashboard.style.display = 'block';
    adminAccounts.style.display = 'none';
    adminHistory.style.display = 'none';
    adminManage.style.display = 'none';
    adminHeading.innerHTML = "My Dashboard";
    adminDashboard.style.animation = 'bannerMoveOne .4s linear forwards';
}
function AdminAccounts() {
    adminDashboard.style.display = 'none';
    adminAccounts.style.display = 'block';
    adminHistory.style.display = 'none';
    adminManage.style.display = 'none';
    adminHeading.innerHTML = "Manage Accounts";
    adminAccounts.style.animation = 'bannerMoveOne .4s linear forwards';
}
function AdminHistory() {
    adminDashboard.style.display = 'none';
    adminAccounts.style.display = 'none';
    adminHistory.style.display = 'block';
    adminManage.style.display = 'none';
    adminHeading.innerHTML = "History";
    adminHistory.style.animation = 'bannerMoveOne .4s linear forwards';
}
function AdminManage() {
    adminDashboard.style.display = 'none';
    adminAccounts.style.display = 'none';
    adminHistory.style.display = 'none';
    adminManage.style.display = 'block';
    adminHeading.innerHTML = "Manage Meeting Rooms";
    adminManage.style.animation = 'bannerMoveOne .4s linear forwards';
}

// Admin Create Meeting Room validation
function AdminCreateRoomValidation(event) {
    event.preventDefault();
    var adminCRName = document.createMeeting.meetname.value;
    var adminCRCapacity = document.createMeeting.capacity.value;
    if(adminCRName == 0) {
        alert("Meeting Room name is invalid");
        return false;
    }
    if(adminCRCapacity == 0) {
        alert("Meeting Room capacity is invalid");
        return false;
    }
    window.location.replace("success.html");
}

// Edit Created Meeting Room (ADMIN)
function OpenEditCreateMeetingRoom() {
    document.getElementById("edit-meeting-room").style.display = 'flex';
}
function CloseEditCreateMeetingRoom() {
    document.getElementById("edit-meeting-room").style.display = 'none';
}

// Success message page
function Success(event) {
    event.preventDefault();
    window.location.replace("success.html");
}
function SuccessHome(event) {
    event.preventDefault();
    window.location.replace("success-home.html");
}

// Book Meeting Form
var Book = document.getElementById("book-form");
function OpenBook() {
    Book.style.display = 'flex';
}
function CloseBook() {
    Book.style.display = 'none';
}

var imp = document.getElementById("import-users");
function OpenImport() {
    imp.style.display = 'flex';
}
function CloseImport() {
    imp.style.display = 'none';
}