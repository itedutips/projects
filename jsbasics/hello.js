console.log('Hello fom file!');
//Objects..
user = {
    name: 'George',
    age: 51
}

console.log(user);

//following are two ways of accessing object's field
console.log(user.name); //commonly used
console.log(user['name']); //handy when field is dynamic

console.log(typeof user); 

//Arrays
let names = ['Alex','Stephan','Mike'];
for(let i=0; i< names.length;i++)
{
    console.log(names[i]);
}
console.log(names);
console.log(typeof names);

//Functions

function game(nameOfGame)
{
    console.log("Favorite game!" + nameOfGame);
}

game("Football!");
