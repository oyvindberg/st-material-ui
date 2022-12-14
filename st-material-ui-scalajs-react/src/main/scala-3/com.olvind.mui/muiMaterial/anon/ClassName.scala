package com.olvind.mui.muiMaterial.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassName extends StObject {
  
  var className: String
  
  var `data-tag-index`: Double
  
  var disabled: Boolean
  
  var key: Double
  
  def onDelete(event: Any): Unit
  
  var tabIndex: -1
}
object ClassName {
  
  inline def apply(
    className: String,
    `data-tag-index`: Double,
    disabled: Boolean,
    key: Double,
    onDelete: Any => Callback
  ): ClassName = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], onDelete = js.Any.fromFunction1((t0: Any) => onDelete(t0).runNow()), tabIndex = -1)
    __obj.updateDynamic("data-tag-index")(`data-tag-index`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassName]
  }
  
  extension [Self <: ClassName](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def `setData-tag-index`(value: Double): Self = StObject.set(x, "data-tag-index", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setOnDelete(value: Any => Callback): Self = StObject.set(x, "onDelete", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setTabIndex(value: -1): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
  }
}
