package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentsRecord[Name /* <: /* keyof any */ String */] extends StObject {
  
  var components: Record[Name, `148`] = js.native
}
object ComponentsRecord {
  
  @scala.inline
  def apply[Name /* <: /* keyof any */ String */](components: Record[Name, `148`]): ComponentsRecord[Name] = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentsRecord[Name]]
  }
  
  @scala.inline
  implicit class ComponentsRecordMutableBuilder[Self <: ComponentsRecord[_], Name /* <: /* keyof any */ String */] (val x: Self with ComponentsRecord[Name]) extends AnyVal {
    
    @scala.inline
    def setComponents(value: Record[Name, `148`]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
  }
}
