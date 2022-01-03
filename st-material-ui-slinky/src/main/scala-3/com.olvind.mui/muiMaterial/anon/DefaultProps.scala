package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultProps extends StObject {
  
  var defaultProps: PickComponentsPropsListMuiAlertcloseText
}
object DefaultProps {
  
  inline def apply(defaultProps: PickComponentsPropsListMuiAlertcloseText): DefaultProps = {
    val __obj = js.Dynamic.literal(defaultProps = defaultProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultProps]
  }
  
  extension [Self <: DefaultProps](x: Self) {
    
    inline def setDefaultProps(value: PickComponentsPropsListMuiAlertcloseText): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
  }
}
