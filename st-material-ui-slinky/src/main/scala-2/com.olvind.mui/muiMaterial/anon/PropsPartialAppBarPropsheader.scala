package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.Interpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropsPartialAppBarPropsheader extends StObject {
  
  var props: PartialAppBarPropsheader = js.native
  
  var style: Interpolation[Theme] = js.native
}
object PropsPartialAppBarPropsheader {
  
  @scala.inline
  def apply(props: PartialAppBarPropsheader): PropsPartialAppBarPropsheader = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsPartialAppBarPropsheader]
  }
  
  @scala.inline
  implicit class PropsPartialAppBarPropsheaderMutableBuilder[Self <: PropsPartialAppBarPropsheader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProps(value: PartialAppBarPropsheader): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: Interpolation[Theme]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
