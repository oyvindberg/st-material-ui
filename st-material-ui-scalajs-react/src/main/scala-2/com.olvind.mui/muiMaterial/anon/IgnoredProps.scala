package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.muiMaterialStrings.disabled
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgnoredProps[P, D /* <: ElementType */] extends StObject {
  
  var defaultComponent: D = js.native
  
  var ignoredProps: disabled = js.native
  
  var props: P with Optional = js.native
}
object IgnoredProps {
  
  @scala.inline
  def apply[P, D /* <: ElementType */](defaultComponent: D, props: P with Optional): IgnoredProps[P, D] = {
    val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], ignoredProps = "disabled", props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgnoredProps[P, D]]
  }
  
  @scala.inline
  implicit class IgnoredPropsMutableBuilder[Self <: IgnoredProps[_, _], P, D /* <: ElementType */] (val x: Self with (IgnoredProps[P, D])) extends AnyVal {
    
    @scala.inline
    def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoredProps(value: disabled): Self = StObject.set(x, "ignoredProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProps(value: P with Optional): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
