package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NameProps[Props, Name /* <: /* keyof any */ String */] extends StObject {
  
  var name: Name = js.native
  
  var props: Props = js.native
}
object NameProps {
  
  @scala.inline
  def apply[Props, Name /* <: /* keyof any */ String */](name: Name, props: Props): NameProps[Props, Name] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameProps[Props, Name]]
  }
  
  @scala.inline
  implicit class NamePropsMutableBuilder[Self <: NameProps[_, _], Props, Name /* <: /* keyof any */ String */] (val x: Self with (NameProps[Props, Name])) extends AnyVal {
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProps(value: Props): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
