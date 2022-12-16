package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@mui/material.@mui/material/styles/props.ComponentsPropsList['MuiAlert'], 'closeText'> */
trait PickComponentsPropsListMuiAlertcloseText extends StObject {
  
  var closeText: js.UndefOr[String] = js.undefined
}
object PickComponentsPropsListMuiAlertcloseText {
  
  inline def apply(): PickComponentsPropsListMuiAlertcloseText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickComponentsPropsListMuiAlertcloseText]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickComponentsPropsListMuiAlertcloseText] (val x: Self) extends AnyVal {
    
    inline def setCloseText(value: String): Self = StObject.set(x, "closeText", value.asInstanceOf[js.Any])
    
    inline def setCloseTextUndefined: Self = StObject.set(x, "closeText", js.undefined)
  }
}
