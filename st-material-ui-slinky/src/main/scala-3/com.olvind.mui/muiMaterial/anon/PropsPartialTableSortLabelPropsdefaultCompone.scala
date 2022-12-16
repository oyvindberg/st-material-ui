package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.Interpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropsPartialTableSortLabelPropsdefaultCompone extends StObject {
  
  var props: PartialTableSortLabelPropsdefaultCompone
  
  var style: Interpolation[Theme]
}
object PropsPartialTableSortLabelPropsdefaultCompone {
  
  inline def apply(props: PartialTableSortLabelPropsdefaultCompone): PropsPartialTableSortLabelPropsdefaultCompone = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsPartialTableSortLabelPropsdefaultCompone]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropsPartialTableSortLabelPropsdefaultCompone] (val x: Self) extends AnyVal {
    
    inline def setProps(value: PartialTableSortLabelPropsdefaultCompone): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Interpolation[Theme]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
