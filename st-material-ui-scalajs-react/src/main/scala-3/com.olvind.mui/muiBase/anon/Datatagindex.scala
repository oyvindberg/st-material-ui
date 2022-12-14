package com.olvind.mui.muiBase.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Datatagindex extends StObject {
  
  var `data-tag-index`: Double
  
  var key: Double
  
  def onDelete(event: Any): Unit
  
  var tabIndex: -1
}
object Datatagindex {
  
  inline def apply(`data-tag-index`: Double, key: Double, onDelete: Any => Callback): Datatagindex = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], onDelete = js.Any.fromFunction1((t0: Any) => onDelete(t0).runNow()), tabIndex = -1)
    __obj.updateDynamic("data-tag-index")(`data-tag-index`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Datatagindex]
  }
  
  extension [Self <: Datatagindex](x: Self) {
    
    inline def `setData-tag-index`(value: Double): Self = StObject.set(x, "data-tag-index", value.asInstanceOf[js.Any])
    
    inline def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setOnDelete(value: Any => Callback): Self = StObject.set(x, "onDelete", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setTabIndex(value: -1): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
  }
}
