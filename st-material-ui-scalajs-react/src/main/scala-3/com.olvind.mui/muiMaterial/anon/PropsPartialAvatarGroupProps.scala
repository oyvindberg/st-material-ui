package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.Interpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropsPartialAvatarGroupProps extends StObject {
  
  var props: PartialAvatarGroupProps
  
  var style: Interpolation[Theme]
}
object PropsPartialAvatarGroupProps {
  
  inline def apply(props: PartialAvatarGroupProps): PropsPartialAvatarGroupProps = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsPartialAvatarGroupProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropsPartialAvatarGroupProps] (val x: Self) extends AnyVal {
    
    inline def setProps(value: PartialAvatarGroupProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Interpolation[Theme]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
