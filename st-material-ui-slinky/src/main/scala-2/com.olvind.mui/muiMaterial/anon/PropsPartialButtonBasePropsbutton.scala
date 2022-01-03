package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.Interpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropsPartialButtonBasePropsbutton extends StObject {
  
  var props: PartialButtonBasePropsbutton = js.native
  
  var style: Interpolation[Theme] = js.native
}
object PropsPartialButtonBasePropsbutton {
  
  @scala.inline
  def apply(props: PartialButtonBasePropsbutton): PropsPartialButtonBasePropsbutton = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsPartialButtonBasePropsbutton]
  }
  
  @scala.inline
  implicit class PropsPartialButtonBasePropsbuttonMutableBuilder[Self <: PropsPartialButtonBasePropsbutton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProps(value: PartialButtonBasePropsbutton): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: Interpolation[Theme]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
