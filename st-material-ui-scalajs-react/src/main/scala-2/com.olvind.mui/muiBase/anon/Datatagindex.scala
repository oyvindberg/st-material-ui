package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.muiBaseNumbers.`-1`
import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Datatagindex extends StObject {
  
  var `data-tag-index`: Double = js.native
  
  var key: Double = js.native
  
  def onDelete(event: Any): Unit = js.native
  
  var tabIndex: `-1` = js.native
}
object Datatagindex {
  
  @scala.inline
  def apply(`data-tag-index`: Double, key: Double, onDelete: Any => Callback): Datatagindex = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], onDelete = js.Any.fromFunction1((t0: Any) => onDelete(t0).runNow()), tabIndex = -1)
    __obj.updateDynamic("data-tag-index")(`data-tag-index`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Datatagindex]
  }
  
  @scala.inline
  implicit class DatatagindexMutableBuilder[Self <: Datatagindex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setData-tag-index`(value: Double): Self = StObject.set(x, "data-tag-index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDelete(value: Any => Callback): Self = StObject.set(x, "onDelete", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    @scala.inline
    def setTabIndex(value: `-1`): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
  }
}
