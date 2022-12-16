package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.Interpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropsPartialPaginationItemPropsdiv extends StObject {
  
  var props: PartialPaginationItemPropsdiv
  
  var style: Interpolation[Theme]
}
object PropsPartialPaginationItemPropsdiv {
  
  inline def apply(props: PartialPaginationItemPropsdiv): PropsPartialPaginationItemPropsdiv = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsPartialPaginationItemPropsdiv]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropsPartialPaginationItemPropsdiv] (val x: Self) extends AnyVal {
    
    inline def setProps(value: PartialPaginationItemPropsdiv): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Interpolation[Theme]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
