package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultProps extends StObject {
  
  var defaultProps: PickComponentsPropsListMuiAlertcloseText = js.native
}
object DefaultProps {
  
  @scala.inline
  def apply(defaultProps: PickComponentsPropsListMuiAlertcloseText): DefaultProps = {
    val __obj = js.Dynamic.literal(defaultProps = defaultProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultProps]
  }
  
  @scala.inline
  implicit class DefaultPropsMutableBuilder[Self <: DefaultProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PickComponentsPropsListMuiAlertcloseText): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
  }
}
