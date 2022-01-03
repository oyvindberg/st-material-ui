package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.muiMaterialNumbers.`-1`
import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassName extends StObject {
  
  var className: String = js.native
  
  var `data-tag-index`: Double = js.native
  
  var disabled: Boolean = js.native
  
  var key: Double = js.native
  
  def onDelete(event: Any): Unit = js.native
  
  var tabIndex: `-1` = js.native
}
object ClassName {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ClassNameMutableBuilder[Self <: ClassName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setData-tag-index`(value: Double): Self = StObject.set(x, "data-tag-index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDelete(value: Any => Callback): Self = StObject.set(x, "onDelete", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    @scala.inline
    def setTabIndex(value: `-1`): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
  }
}
