// in the negotiateValidateandEstablishTrust
// if request does not have a SAML token or it's invalid
TAIResult result = TAIResult.create(HttpServletResponse.SC_MOVED_TEMPORARILY);
resp.setHeader("Location", "[link to OAM login form]?redirectUrl=[link to your app]");
return result;