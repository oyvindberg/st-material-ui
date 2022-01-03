package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.muiMaterialStrings.disabled
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgnoredProps[P, D /* <: ReactElement */] extends StObject {
  
  var defaultComponent: D = js.native
  
  var ignoredProps: disabled = js.native
  
  var props: P with Optional = js.native
}
object IgnoredProps {
  
  @scala.inline
  def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P with Optional): IgnoredProps[P, D] = {
    val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], ignoredProps = "disabled", props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgnoredProps[P, D]]
  }
  
  @scala.inline
  implicit class IgnoredPropsMutableBuilder[Self <: IgnoredProps[_, _], P, D /* <: ReactElement */] (val x: Self with (IgnoredProps[P, D])) extends AnyVal {
    
    @scala.inline
    def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoredProps(value: disabled): Self = StObject.set(x, "ignoredProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProps(value: P with Optional): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
