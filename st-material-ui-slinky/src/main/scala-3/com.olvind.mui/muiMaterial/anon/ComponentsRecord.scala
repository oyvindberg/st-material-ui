package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentsRecord[Name /* <: /* keyof any */ String */] extends StObject {
  
  var components: Record[Name, `148`]
}
object ComponentsRecord {
  
  inline def apply[Name /* <: /* keyof any */ String */](components: Record[Name, `148`]): ComponentsRecord[Name] = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentsRecord[Name]]
  }
  
  extension [Self <: ComponentsRecord[?], Name /* <: /* keyof any */ String */](x: Self & ComponentsRecord[Name]) {
    
    inline def setComponents(value: Record[Name, `148`]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
  }
}
