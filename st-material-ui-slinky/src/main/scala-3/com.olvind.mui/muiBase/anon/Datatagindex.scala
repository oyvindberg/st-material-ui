package com.olvind.mui.muiBase.anon

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
  
  inline def apply(`data-tag-index`: Double, key: Double, onDelete: Any => Unit): Datatagindex = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], onDelete = js.Any.fromFunction1(onDelete), tabIndex = -1)
    __obj.updateDynamic("data-tag-index")(`data-tag-index`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Datatagindex]
  }
  
  extension [Self <: Datatagindex](x: Self) {
    
    inline def `setData-tag-index`(value: Double): Self = StObject.set(x, "data-tag-index", value.asInstanceOf[js.Any])
    
    inline def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setOnDelete(value: Any => Unit): Self = StObject.set(x, "onDelete", js.Any.fromFunction1(value))
    
    inline def setTabIndex(value: -1): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
  }
}
