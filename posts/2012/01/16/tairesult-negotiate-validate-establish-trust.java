public TAIResult negotiateValidateandEstablishTrust(
  HttpServletRequest req, HttpServletResponse resp)
  throws WebTrustAssociationFailedException {

  // get SAML token from request, e.g. request.getAttribute("SAML")
  String username = ""; // get the user name from SAML token (its just XML)
  return TAIResult.create(HttpServletResponse.SC_OK, user);
}