/*STARTING SCREEN*/

function playerOneName() {
    var namePlayerOne = document.getElementById("InputNameOne").value;
    var a = "Input Your Name";

    

    if (namePlayerOne == a) {
        document.getElementById("NameOne").innerHTML = "'You Should choose another Name'";
    }else{
        if (namePlayerOne.length < 4){
            document.getElementById("NameOne").innerHTML = "The name is too short";
        }else{
            if (namePlayerOne.length > 10) {
                document.getElementById("NameOne").innerHTML = "The name is too long";
            }else{
                document.getElementById("NameOne").innerHTML =  namePlayerOne ;
                document.getElementById("selectTheSkin").innerHTML = namePlayerOne ;
            }
        }
    }
}

/*SKIN SELECTOR*/

function maleSkinSelected() {
    document.getElementById("maleSkinselect").innerHTML = "SELECTED";
    document.getElementById("femaleSkinSelect").innerHTML = "SELECT";
    document.getElementById("blackSkinSelect").innerHTML = "SELECT";
    maleskin = true;
    femaleskin = false;
    blackskin = false;
}
function femaleSkinSelected() {
    document.getElementById("maleSkinselect").innerHTML = "SELECT";
    document.getElementById("femaleSkinSelect").innerHTML = "SELECTED";
    document.getElementById("blackSkinSelect").innerHTML = "SELECT";
    maleskin = false;
    femaleskin = true;
    blackskin = false;
}
function blackSkinSelected() {
    document.getElementById("maleSkinselect").innerHTML = "SELECT";
    document.getElementById("femaleSkinSelect").innerHTML = "SELECT";
    document.getElementById("blackSkinSelect").innerHTML = "SELECTED";
    maleskin = false;
    femaleskin = false;
    blackskin = true;
}
