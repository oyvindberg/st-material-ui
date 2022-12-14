package com.olvind.mui.muiBase.components

import com.olvind.mui.StBuildingComponent
import com.olvind.mui.muiBase.utilsClassNameConfiguratorMod.ClassNameConfiguratorProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ClassNameConfigurator {
  
  @JSImport("@mui/base/utils", "ClassNameConfigurator")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def disableDefaultClasses(value: Boolean): this.type = set("disableDefaultClasses", value.asInstanceOf[js.Any])
  }
  
  type Props = ClassNameConfiguratorProps
  
  implicit def make(companion: ClassNameConfigurator.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def styled: com.olvind.mui.StyledComponent.Builder[ClassNameConfiguratorProps, Builder] = new com.olvind.mui.StyledComponent.Builder[ClassNameConfiguratorProps, Builder](this.component, new js.Object, js.Array(), (newComponent: Any) => new Builder(js.Array(newComponent, js.Dictionary.empty)))
  
  def withProps(p: ClassNameConfiguratorProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
