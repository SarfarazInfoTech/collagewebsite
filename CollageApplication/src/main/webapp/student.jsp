<%-- 
    Document   : student
    Created on : 28 Sep, 2021, 12:43:01 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- CSS only -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
        <title>Student Form</title>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <h1 class="text-center p-3">Student Regestation</h1> <br>

                <form action="StudentController" method="post" class="row g-3 needs-validation" novalidate>
                    <div class="col-md-7">

                        <label for="validationCustom01" class="form-label">Name</label>
                        <input type="hidden" name="action" value="insert"> 
                        <input name="name" type="text" class="form-control" id="validationCustom01" value="" required>
                    </div>
                    <div class="col-md-7">
                        <label for="validationCustom02" class="form-label">Email</label>
                        <input name="email" type="email" class="form-control" id="validationCustom02" value="" required>
                    </div>
                    <div class="col-md-7">
                        <label for="validationCustom02" class="form-label">Phone</label>
                        <input name="phone" type="number" class="form-control" id="validationCustom02" value="" required>
                    </div>
                    <div class="col-md-7">
                        <label for="validationCustom02" class="form-label">Branch</label>
                        <select name="branch" class="form-select" id="validationCustom04" required>
                            <option selected disabled value="">--Select Branch--</option>
                            <option value="CS">CS</option>
                            <option value="CO">CO</option>
                            <option value="CSE">CSE</option>
                            <option value="EE">EE</option>
                            <option value="EJ">EJ</option>
                            <option value="ME">ME</option>
                        </select>
                    </div>

                    <div class="col-md-7">
                        <label for="validationCustom01" class="form-label">Address</label>
                        <textarea name="address" type="textbox" class="form-control" id="validationCustom01" value="" required></textarea>
                    </div>

                    <div class="col-md-7">
                        <label for="validationCustom03" class="form-label">City</label>
                        <select name="city" class="form-select" id="validationCustom04" required>
                            <option selected disabled>--Select City--</option>
                            <option value="nagpur">Nagpur</option>
                            <option value="wardha">Wardha</option>
                            <option value="amravati">Amravati</option>
                            <option value="kanan">Kanan</option>
                            <option value="pune">Pune</option>
                            <option value="mumbai">Mumbai</option>
                        </select>
                    </div>
                    <div class="col-md-7">
                        <label for="validationCustom04" class="form-label">State</label>
                        <select name="state" class="form-select" id="validationCustom04" required>
                            <option selected disabled>--Select State--</option>
                            <option value="Maharashatra">Maharashatra</option>
                            <option value="Goa">Goa</option>
                            <option value="MP">MP</option>
                        </select>

                    </div>

                    <!--                    <div class="col-md-7">
                                            <div class="form-check">
                                                <input class="form-check-input" type="checkbox" value="" id="invalidCheck" required>
                                                <label class="form-check-label" for="invalidCheck">
                                                    Agree to terms and conditions
                                                </label>
                                            </div>
                                            
                                        </div>-->
                    <div class="col-md-7">
                        <button class="btn btn-primary" type="submit">Submit form</button>
                        <button class="btn btn-primary" type="reset">Reset</button>
                    </div>

                </form>
                
            </div>
            <h2>${param.msg}</h2>
        </div>

        <!-- JavaScript Bundle with Popper -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ" crossorigin="anonymous"></script>
    </body>
</html>
