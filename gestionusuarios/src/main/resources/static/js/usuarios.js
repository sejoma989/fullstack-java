// Call the dataTables jQuery plugin
$(document).ready(function() {
    cargarUsuarios();
  $('#userTable').DataTable();
  actualizarEmail();
});

function actualizarEmail() {
    document.getElementById('txt-email-usuario').outerHTML = localStorage.email;
}

async function cargarUsuarios() {

  const request = await fetch('api/usuarios', {
    method: 'GET',
    headers: getHeaders()
  });
  const usuarios = await request.json();
  // console.log(usuarios);

  let listadoHtml = '';
  for ( let usuario of usuarios ) {
    let botonEliminar = '<a href="#" onclick=deleteUsuario(' + usuario.id + ') class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a>'
    let telefonoTexto = usuario.telefono == null || usuario.telefono == ''? '--' : usuario.telefono;

    let usuarioHtml = '<tr><td>'
                        +usuario.id+'</td><td>'
                        +usuario.nombre+' '+usuario.apellido+'</td><td>'
                        +usuario.email+'</td><td>'
                        + telefonoTexto +'</td><td>' + botonEliminar + '</td></tr>';
    listadoHtml += usuarioHtml;
  }
  document.querySelector('#userTable tbody').outerHTML = listadoHtml;
}

function getHeaders(){
    return {
      'Accept': 'application/json',
      'Content-Type': 'application/json',
      'Autorization': localStorage.token
    }
}

async function deleteUsuario(id) {

  if( !confirm('¿Desea eliminar este usuario?: ' + id) ) {
    return;
  }

  const request = await fetch('api/usuarios/' + id, {
    method: 'DELETE',
    headers: getHeaders()
  });
  location.reload();
}

