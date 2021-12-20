<%-- 
    Document   : teachers
    Created on : 28 Sep, 2021, 12:43:30 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- CSS only -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
        <title>Teachers Form</title>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <h1 class="text-center p-3">Teachers Information</h1> <br>

                <form action="TeachersController" method="post" class="row g-3 needs-validation" novalidate>
                    <div class="col-md-7">
                        <label for="validationCustom01" class="form-label">Name</label>
                        <input type="hidden" name="action" value="insert"> 
                        <input type="text" name="name" class="form-control" id="validationCustom01" value="" required>
                    </div>
                    <div class="col-md-7">
                        <label for="validationCustom02" class="form-label">Email</label>
                        <input type="email" name="email" class="form-control" id="validationCustom02" value="" required>
                    </div>
                    <div class="col-md-7">
                        <label for="validationCustom02" class="form-label">Phone</label>
                        <input type="number" name="phone" class="form-control" id="validationCustom02" value="" required>
                    </div>
                    <div class="col-md-7">
                        <label for="validationCustom02" class="form-label">Salary</label>
                        <input type="number" name="salary" class="form-control" id="validationCustom02" value="" required>
                    </div>

                    <div class="col-md-7">
                        <label for="validationCustom02" class="form-label">Subject Teacher</label>
                        <select name="subject_t" class="form-select" id="validationCustom04" required>
                            <option selected disabled value="">--Select Branch--</option>
                            <option value="CS">CS</option>
                            <option value="CO">CO</option>
                            <option value="CSE">CSE</option>
                            <option value="EE">EE</option>
                            <option value="EJ">EJ</option>
                            <option value="ME">ME</option>
                        </select>
                    </div>

                    <!-- Default radio -->

                    <label for="validationCustom02" class="form-label">Class Teacher</label>
                    <div class="form-check">

                        <input name="class_t"
                               value="yes"
                               class="form-check-input"
                               type="radio"
                               name="radio"
                               id="flexRadioDefault1"
                               />
                        <label class="form-check-label" for="flexRadioDefault1"> Yes </label>
                    </div>

                    <!-- Default checked radio -->
                    <div class="form-check">
                        <input
                            name="class_t"
                            value="no"
                            class="form-check-input"
                            type="radio"
                            name="radio"
                            id="flexRadioDefault2"
                            checked
                            />
                        <label class="form-check-label" for="flexRadioDefault2"> No </label>
                    </div>


                    <div class="col-md-7">
                        <button class="btn btn-danger" type="submit">Save</button>
                    </div>

                </form>
            </div>
            <h2>${param.msg}</h2>
        </div>

        <!-- JavaScript Bundle with Popper -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ" crossorigin="anonymous"></script>
    </body>
</html>
