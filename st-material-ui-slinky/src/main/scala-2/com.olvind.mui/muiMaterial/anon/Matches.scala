package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Matches extends StObject {
  
  var matches: Boolean = js.native
}
object Matches {
  
  @scala.inline
  def apply(matches: Boolean): Matches = {
    val __obj = js.Dynamic.literal(matches = matches.asInstanceOf[js.Any])
    __obj.asInstanceOf[Matches]
  }
  
  @scala.inline
  implicit class MatchesMutableBuilder[Self <: Matches] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMatches(value: Boolean): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
  }
}
